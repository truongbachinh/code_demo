package shopping.dao;

import shopping.model.CartInfo;
import shopping.model.OrderDetailInfo;
import shopping.model.OrderInfo;
import shopping.model.PaginationResult;

import java.util.List;

public interface OrderDAO {
    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
