package com.example.miniprojektwishlist.Repository;

import com.example.miniprojektwishlist.Model.WishlistAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class WishlistRepo {
    public WishlistRepo() {
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void registerAccount(String username, String password) {
        String sql = "INSERT INTO accounts (username, password) VALUES (?, ?)";
        jdbcTemplate.update(sql, username, password);
    }
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM accounts WHERE username = ? AND password = ?";
        List<WishlistAccount> accounts = jdbcTemplate.query(sql, new Object[]{username, password}, (rs, rowNum) -> {
            WishlistAccount account = new WishlistAccount();
            account.setUsername(rs.getString("username"));
            account.setPassword(rs.getString("password"));
            return account;
        });

        return !accounts.isEmpty();
    }
}
