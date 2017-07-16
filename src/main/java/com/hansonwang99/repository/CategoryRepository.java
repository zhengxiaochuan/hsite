package com.hansonwang99.repository;

import com.hansonwang99.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByUserIdAndName( Long userId, String name );

    List<Category> findByUserIdOrderByIdDesc(Long userId);
}