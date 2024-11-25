 package com.example.samuraitravel.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FavoriteForm {
    private Integer id; // 更新時などで利用するために含める場合があります。

    @NotNull(message = "ハウスIDは必須です")
    private Integer houseId;

    @NotNull(message = "ユーザーIDは必須です")
    private Integer userId;
}
