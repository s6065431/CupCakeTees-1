package uk.ac.tees.cupcake.account;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import uk.ac.tees.cupcake.R;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        setTitle("Edit Profile");
    }
}
