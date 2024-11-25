import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samuraitravel.entity.Favorite;
import com.example.samuraitravel.form.FavoriteForm;
import com.example.samuraitravel.service.FavoriteService;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/user/{userId}")
    public List<Favorite> getFavoritesByUser(@PathVariable Integer userId) {
        return favoriteService.getFavoritesByUserId(userId);
    }

    @PostMapping("/add")
    public Favorite addFavorite(@RequestBody FavoriteForm form) {
        return favoriteService.addFavorite(form);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFavorite(@PathVariable Integer id) {
        favoriteService.deleteFavorite(id);
        return "お気に入りを削除しました";
    }
}