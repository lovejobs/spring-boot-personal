package com.lovejobs.dao;

import com.lovejobs.model.AppIdTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppIdTableDao extends JpaRepository<AppIdTable,Long> {

    List<AppIdTable> findByAppId(String appId);

    List<AppIdTable> findAllByAppId(String appId);
}
