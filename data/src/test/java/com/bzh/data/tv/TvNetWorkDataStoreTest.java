package com.bzh.data.tv;

import android.support.annotation.NonNull;

import com.bzh.data.ApplicationTestCase;
import com.bzh.data.basic.BaseInfoEntity;
import com.bzh.data.film.FilmDetailEntity;
import com.bzh.data.repository.RetrofitManager;
import com.google.gson.Gson;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import rx.Subscriber;

import static org.junit.Assert.*;

/**
 * ==========================================================<br>
 * <b>版权</b>：　　　别志华 版权所有(c)2016<br>
 * <b>作者</b>：　　  biezhihua@163.com<br>
 * <b>创建日期</b>：　16-3-26<br>
 * <b>描述</b>：　　　<br>
 * <b>版本</b>：　    V1.0<br>
 * <b>修订历史</b>：　<br>
 * ==========================================================<br>
 */
public class TvNetWorkDataStoreTest extends ApplicationTestCase {

    private ITvService tvService;
    private TvNetWorkDataStore tvNetWorkDataStore;
    private Gson gson;
    private Subscriber<ArrayList<BaseInfoEntity>> subscriber;

    @Before
    public void setUp() throws Exception {
        gson = new Gson();
        tvService = RetrofitManager.getInstance().getTvService();
        tvNetWorkDataStore = new TvNetWorkDataStore(tvService);
        subscriber = new Subscriber<ArrayList<BaseInfoEntity>>() {
            @Override
            public void onCompleted() {
                System.out.println("");
            }

            @Override
            public void onError(Throwable e) {
                assertNull(e);
                System.out.println("e = [" + e + "]");
            }

            @Override
            public void onNext(ArrayList<BaseInfoEntity> baseInfoEntities) {
                assertNotNull(baseInfoEntities);
                assertTrue(baseInfoEntities.size() > 0);
                System.out.println(gson.toJson(baseInfoEntities));
            }
        };
    }

    @NonNull
    private Subscriber<FilmDetailEntity> getRiHanSubscriber() {
        return new Subscriber<FilmDetailEntity>() {
            @Override
            public void onCompleted() {
                System.out.println("");
            }

            @Override
            public void onError(Throwable e) {
                assertNull(e);
            }

            @Override
            public void onNext(FilmDetailEntity filmDetailEntity) {
                System.out.println(gson.toJson(filmDetailEntity));
                assertNotNull(filmDetailEntity);
                assertNotNull(filmDetailEntity.getPlayName());
                assertNotNull(filmDetailEntity.getSource());
                assertNotNull(filmDetailEntity.getType());
                assertNotNull(filmDetailEntity.getPremiere());
                assertNotNull(filmDetailEntity.getScreenWriter());
                assertNotNull(filmDetailEntity.getDirector());
                assertNotNull(filmDetailEntity.getLeadingPlayers());
                assertNotNull(filmDetailEntity.getEpisodeNumber());
                assertNotNull(filmDetailEntity.getDescription());
            }
        };
    }

    @After
    public void tearDown() throws Exception {
        tvService = null;
        tvNetWorkDataStore = null;
    }

    @Test
    public void testGetChineseDomesticTv() throws Exception {
        tvNetWorkDataStore.getChineseDomesticTv(1).subscribe(subscriber);
    }

    @Test
    public void testGetHKTTv() throws Exception {
        tvNetWorkDataStore.getHKTTv(1).subscribe(subscriber);
    }

    @Test
    public void testGetChineseTV() throws Exception {
        tvNetWorkDataStore.getChineseTv(1).subscribe(subscriber);
    }

    @Test
    public void testGetJapanSouthKoreaTV() throws Exception {
        tvNetWorkDataStore.getJapanSouthKoreaTV(1).subscribe(subscriber);
    }

    @Test
    public void testGetEuropeAmericaTV() throws Exception {
        tvNetWorkDataStore.getEuropeAmericaTV(1).subscribe(subscriber);
    }

    @Test
    public void testGetTvDetail() throws Exception {
        tvNetWorkDataStore.getTvDetail("/html/tv/hytv/20160226/50311.html").subscribe(new Subscriber<FilmDetailEntity>() {
            @Override
            public void onCompleted() {
                System.out.println("");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("e = [" + e + "]");
            }

            @Override
            public void onNext(FilmDetailEntity filmDetailEntity) {
                System.out.println("filmDetailEntity = [" + filmDetailEntity + "]");
            }
        });
    }

    @Test
    public void testGetRIHanTvDetail() throws Exception {
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20160329/50567.html").subscribe(getRiHanSubscriber());
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20160329/50566.html").subscribe(getRiHanSubscriber());
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20160329/50565.html").subscribe(getRiHanSubscriber());
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20160328/50558.html").subscribe(getRiHanSubscriber());
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20160320/50506.html").subscribe(getRiHanSubscriber());
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20160123/50028.html").subscribe(getRiHanSubscriber());
        tvNetWorkDataStore.getTvDetail("/html/tv/rihantv/20150519/48105.html").subscribe(getRiHanSubscriber());

    }

    @Test
    public void testGet欧美TvDetail() throws Exception {
        tvNetWorkDataStore.getTvDetail("/html/tv/oumeitv/20160404/50634.html").subscribe(getOMSubscriber());
    }

    @NonNull
    private Subscriber<FilmDetailEntity> getOMSubscriber() {
        return new Subscriber<FilmDetailEntity>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                assertNull(e);
            }

            @Override
            public void onNext(FilmDetailEntity filmDetailEntity) {
                System.out.println(gson.toJson(filmDetailEntity));
                assertNotNull(filmDetailEntity);
            }
        };
    }

}