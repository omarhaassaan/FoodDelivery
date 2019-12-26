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
public class MakeFeedback implements CustomerOperation {
    
    private Feedback feedback = new Feedback ();
    @Override
    public void execute() {
        feedback.setFeedback();
    }
    
}
