package sg.edu.rp.c346.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MyContacts> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MyContacts> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCountryCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhoneNumber = rowView.findViewById(R.id.textViewPhoneNumber);

        MyContacts currentItem = contactList.get(position);

        String name = currentItem.getName();
        int countryCode = currentItem.getCountryCode();
        int phoneNumber = currentItem.getPhoneNum();

        tvName.setText(name);
        tvCountryCode.setText(countryCode+"");
        tvPhoneNumber.setText(phoneNumber+"");

        return rowView;

    }

}