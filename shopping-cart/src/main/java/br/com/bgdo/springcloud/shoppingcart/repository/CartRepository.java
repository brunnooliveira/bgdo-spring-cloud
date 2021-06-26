package br.com.bgdo.springcloud.shoppingcart.repository;

import br.com.bgdo.springcloud.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
