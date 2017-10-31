package mvc;

import java.awt.event.ActionEvent;

/**
 *  Used to notify interested objects of
 *  changes in the state model
 */
public class ModelEvent extends ActionEvent{

    private int amount;

    public ModelEvent(Object source, int id, String message, int amount) {
        super(source, id, message);

        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
