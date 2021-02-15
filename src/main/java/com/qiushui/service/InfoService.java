package com.qiushui.service;


import com.qiushui.module.Info;

public interface InfoService {
    Info queryByTypeAndName(String type, String name) ;
}
