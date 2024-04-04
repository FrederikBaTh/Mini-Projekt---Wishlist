package com.example.miniprojektwishlist.Controller;

import com.example.miniprojektwishlist.Model.WishlistAccount;
import com.example.miniprojektwishlist.Service.WishlistService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WishlistController {

    public WishlistService wishlistService;


    @PostMapping("/register")
    public void registerAccount(WishlistAccount register) {
        wishlistService.registerAccount(register.getUsername(), register.getPassword());
    }
    @PostMapping("/login")
    public boolean login(WishlistAccount loginToAccount) {
        return wishlistService.login(loginToAccount.getUsername(), loginToAccount.getPassword());
    }
}
