package com.example.samuraitravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samuraitravel.entity.Favorite;
import com.example.samuraitravel.form.FavoriteForm;
import com.example.samuraitravel.repository.FavoriteRepository;
import com.example.samuraitravel.repository.HouseRepository;
import com.example.samuraitravel.repository.UserRepository;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Favorite> getFavoritesByUserId(Integer userId) {
        return favoriteRepository.findByUser_Id(userId);
    }

    public Favorite addFavorite(FavoriteForm form) {
        Favorite favorite = new Favorite();
        favorite.setUser(userRepository.findById(form.getUserId()).orElseThrow());
        favorite.setHouse(houseRepository.findById(form.getHouseId()).orElseThrow());
        return favoriteRepository.save(favorite);
    }

    public void deleteFavorite(Integer id) {
        favoriteRepository.deleteById(id);
    }
}
