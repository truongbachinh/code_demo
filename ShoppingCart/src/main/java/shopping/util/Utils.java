package shopping.util;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shopping.model.CartInfo;
import shopping.model.CustomerInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Utils {
    // Thông tin các mặt hàng đã mua, được lưu trữ trong Session.
    public static CartInfo getCartInSession(HttpServletRequest request) {


        // Thông tin giỏ hàng có thể đã lưu vào trong Session trước đó.
        CartInfo cartInfo = (CartInfo) request.getSession().getAttribute("myCart");


        // Nếu chưa tạo giỏ hàng, tạo nó.
        if (cartInfo == null) {
            cartInfo = new CartInfo();


            // Và lưu vào trong session.
            request.getSession().setAttribute("myCart", cartInfo);
        }

        return cartInfo;
    }
    public static void removeCartInSession(HttpServletRequest request) {
        request.getSession().removeAttribute("myCart");
    }
    public static void storeLastOrderedCartInSession(HttpServletRequest request, CartInfo cartInfo) {
        request.getSession().setAttribute("lastOrderedCart", cartInfo);
    }

    public static CartInfo getLastOrderedCartInSession(HttpServletRequest request) {
        return (CartInfo) request.getSession().getAttribute("lastOrderedCart");
    }



}
