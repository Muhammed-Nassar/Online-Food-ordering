/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.manager;

import com.aklny.common.bean.CityBean;
import com.aklny.common.bean.ZoneBean;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author 4G
 */
@Service
public interface LookupsManager {
    //City features-------------------------------

    public CityBean addCity(CityBean cityBean);

    public CityBean updateCity(CityBean cityBean);

    public void removeCity(Integer id);

    public CityBean findByIdCity(Integer id);

    public List<CityBean> findListCity();

    //Zone features-------------------------------
    public ZoneBean addZone(ZoneBean zoneBean);

    public ZoneBean updateZone(ZoneBean ZoneBean);

    public void removeZone(Integer id);

    public ZoneBean findByIdZone(Integer id);

    public List<ZoneBean> findListZone();

}
