/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.delivery;

/**
 *
 * @author Lenovo
 */
public class AddToCart implements CustomerOperation {

    private Cart cart = new Cart();
    private int index;

    AddToCart(int index) {
        this.index = index;
    }

    @Override
    public void execute() {
        cart.add(index);
    }

}
