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
public class RemoveFromCart implements CustomerOperation {

    private Cart cart = new Cart();
    private int index;

    RemoveFromCart(int index) {
        this.index = index;
    }

    @Override
    public void execute() {
        cart.remove(index);
    }
}
