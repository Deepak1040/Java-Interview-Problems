class Restaurant{
    String CustomerName;
    int orderNumber;
    String deliveryType;
    String foodName;
    long phoneNumber;
    
    public Restaurant(String name, int order,String delivery,String f_name,long num)
    {

    }

    public Restaurant(){}
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


public class BrilliantRestaurant{

    public static void main(String[] args) {
        Restaurant res= new Restaurant();
        System.out.println(res.getCustomerName());
        
        
        
    }

}
