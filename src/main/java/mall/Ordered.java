
package mall;

public class Ordered extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getProductid() {
        return productId;
    }

    public void setProductid(String productId) {
        this.productId = productId;
    }
}
