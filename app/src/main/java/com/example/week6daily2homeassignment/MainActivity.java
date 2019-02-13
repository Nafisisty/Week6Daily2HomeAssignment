package com.example.week6daily2homeassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.week6daily2homeassignment.model.Address;
import com.example.week6daily2homeassignment.model.CalculatePayroll;
import com.example.week6daily2homeassignment.model.Employee;
import com.example.week6daily2homeassignment.model.Name;
import com.example.week6daily2homeassignment.model.TimeSheet;
import com.flurry.android.FlurryAgent;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    CalculatePayroll calculatePayroll;
    TextView employeeNameTextView;
    TextView employeeAddressTextView;
    TextView employeePayrollTextView;


    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "SSHZ9VG75KCN29SXZQPS");

        employeeNameTextView = findViewById(R.id.employeeNameTextViewId);
        employeeAddressTextView = findViewById(R.id.employeeAddressTextViewId);
        employeePayrollTextView = findViewById(R.id.employeePayrollTextViewId);


        Address address = new Address("2824 PLENNIE LN", "LAWRENCEVILLE", "GA", "30044", "USA");
        Name name = new Name("Kazi Nafis", "", "Ishtiaque", "");
        TimeSheet timeSheet = new TimeSheet(27, true, 80);
        Employee employee = new Employee(name, address, timeSheet);
        calculatePayroll = new CalculatePayroll(employee);
    }

    public void onClick(View view) {
        employeeNameTextView.setText(calculatePayroll.getCalculatedPayroll().get("name"));
        employeeAddressTextView.setText(calculatePayroll.getCalculatedPayroll().get("address"));
        employeePayrollTextView.setText(calculatePayroll.getCalculatedPayroll().get("pay"));

        FlurryAgent.logEvent("SHOW BUTTON CLICKED");

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "showButtonId");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "SHOW");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Button");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
