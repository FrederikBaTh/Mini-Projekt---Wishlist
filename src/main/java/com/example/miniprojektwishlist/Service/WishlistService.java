package com.example.miniprojektwishlist.Service;


import com.example.miniprojektwishlist.Repository.WishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {

    private static WishlistRepo wishlistRepo;


    @Autowired
    public WishlistService(WishlistRepo wishlistRepo) {
        this.wishlistRepo = wishlistRepo;
    }

    public static void registerAccount(String username, String password) {
        wishlistRepo.registerAccount(username, password);
    }
    public static boolean login(String username, String password) {
        return wishlistRepo.login(username, password);
    }








}
