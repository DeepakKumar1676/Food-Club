package com.dev.Food_Club.DTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
@JsonPropertyOrder({
        "restaurantId",
        "restaurantname",
        "menuList"
})
public class RestaurantResponseDto {

    private Long restaurantId;
    private String restaurantname;
    private List<MenuDto> menuList;

    public void setMenuList(List<MenuDto> menuList) {
        this.menuList = menuList;
    }
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }
}
