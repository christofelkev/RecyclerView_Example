package org.chrivin.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ichigo","ichigo@gmail.com","https://cdn.idntimes.com/content-images/duniaku/post/20211217/263715644-1103042557198843-2071395638488819810-n-21168d48e29e294dd504604ac6ad8705_600x400.jpg"));
        contacts.add(new Contact("Saitama","saitama@gmail.com","https://dafunda.com/wp-content/uploads/2021/09/fakta-unik-saitama-one-punch-man.jpg"));
        contacts.add(new Contact("Naruto","naruto@gmail.com","https://cdn.oneesports.id/cdn-data/sites/2/2022/03/naruto-uzumaki-1-1024x653.jpg"));
        contacts.add(new Contact("Denji","denji@gmail.com","https://static.wikia.nocookie.net/chainsaw-man/images/f/fd/Dengy.png/revision/latest/scale-to-width-down/350?cb=20210421031516.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}