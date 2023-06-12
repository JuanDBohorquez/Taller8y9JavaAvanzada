package co.edu.sena.projectjdb2687350.model;

public class Products {

    private Integer product_id;
    private String product_name;
    private Integer product_value;
    private Integer category_id_fk;

    public Products(){

    }

    public Products(Integer product_id, String product_name, Integer product_value, Integer category_id_fk) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_value = product_value;
        this.category_id_fk = category_id_fk;
    }

    public Products(String product_name, Integer product_value, Integer category_id_fk) {
        this.product_name = product_name;
        this.product_value = product_value;
        this.category_id_fk = category_id_fk;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_value() {
        return product_value;
    }

    public void setProduct_value(Integer product_value) {
        this.product_value = product_value;
    }

    public Integer getCategory_id_fk() {
        return category_id_fk;
    }

    public void setCategory_id_fk(Integer category_id_fk) {
        this.category_id_fk = category_id_fk;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_value=" + product_value +
                ", category_id_fk=" + category_id_fk +
                '}';
    }
}