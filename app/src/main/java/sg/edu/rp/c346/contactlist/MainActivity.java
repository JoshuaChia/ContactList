package sg.edu.rp.c346.contactlist;

import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;

    ArrayList<MyContacts> alContactsList;

    CustomAdapter caContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);

        alContactsList = new ArrayList<>();

        MyContacts for1 = new MyContacts("Mary",65, 65442334);
        MyContacts for2 = new MyContacts("Ken", 65, 97442437);

        alContactsList.add(for1);
        alContactsList.add(for2);

        caContacts = new CustomAdapter(this,R.layout.contacts_item, alContactsList);

        lvContacts.setAdapter(caContacts);





    }
}
