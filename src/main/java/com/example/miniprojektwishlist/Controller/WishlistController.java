package com.example.miniprojektwishlist.Controller;

import com.example.miniprojektwishlist.Model.WishlistAccount;
import com.example.miniprojektwishlist.Service.WishlistService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class WishlistController {
    @PostMapping("/register")
    public void registerAccount( WishlistAccount register) {
        WishlistService.registerAccount(register.getUsername(), register.getPassword());
    }
    @PostMapping("/login")
    public boolean login(WishlistAccount loginToAccount) {
        return WishlistService.login(loginToAccount.getUsername(), loginToAccount.getPassword());
    }
}
