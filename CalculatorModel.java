import mvc.AbstractModel;
import mvc.ModelEvent;

/**
 * Created by ecborera on 10/29/17.
 */
public class CalculatorModel extends AbstractModel {

    private int total = 0;
    private int current = 0;
    private String state = "add";

    public void clear(){
        total = 0;
        store(0);
    }

    public void store(int value) {
        current = value;
        ModelEvent me = new ModelEvent(this, 1, "", current);
        notifyChanged(me);
    }

    public void add() {
        state = "add";
        total = current;
    }

    public void subtract() {
        state = "subtract";
        total = current;
    }

    public void equals() {
        if (state.equals("add")) {
            total += current;
        } else {
            total -= current;
        }

        current = total;

        // Notify any intended parties in the new total
        ModelEvent me = new ModelEvent(this, 1, "", total);
        notifyChanged(me);
    }
}
