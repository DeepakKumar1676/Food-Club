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
public RestaurantResponseDto(){}

    public String getRestaurantname() {
        return restaurantname;
    }

    public List<MenuDto> getMenuList() {
        return menuList;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }



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
