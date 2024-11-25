package com.example.samuraitravel.repository;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samuraitravel.entity.Favorite;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
    List<Favorite> findByUser_Id(Integer userId);  // ユーザーごとのお気に入りを取得
    List<Favorite> findByHouse_Id(Integer houseId); // ハウスごとのお気に入りを取得
}
