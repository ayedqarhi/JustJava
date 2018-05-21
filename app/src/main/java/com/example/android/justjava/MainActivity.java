/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrders(View view) {
        String message = createOrderSummary(5);
        displayMessage(message);

    }

    public void displayMessage(String message){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int mynumber) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + mynumber);
    }

    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    /**
     * Calculates the price of the order.
     *
    */
    private String createOrderSummary(int priceOfOrder){
        String summary = "Name: Ayed Qarhy";
        summary += "\nQuantity: "+quantity;
        summary += "\nTotal: $"+(quantity*priceOfOrder);
        summary += "\nThank you";
        return summary;
    }


}