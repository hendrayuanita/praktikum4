package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    EditText editTextPassword, editTextCode, editTextNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding edt_txt_password ke variabel editTextPassword
        editTextCode = findViewById(R.id.edt_reset_code);
        editTextPassword = findViewById(R.id.edt_new_password);
        editTextNewPassword = findViewById(R.id.edt_confirm_password);


    }

    public void postChangePassword(View view){

//        String regexStr = "^[0-9]*$";

        if(TextUtils.isEmpty(editTextCode.getText().toString().trim()) ||
                TextUtils.isEmpty(editTextPassword.getText().toString().trim()) || TextUtils.isEmpty(editTextNewPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Reset Code, New Password dan Confirm Password tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }else if(!editTextPassword.getText().toString().equals(editTextNewPassword.getText().toString())){
            Toast.makeText(view.getContext(), "password dan confirm password tidak sama",
                    Toast.LENGTH_LONG).show();
        }else if(!editTextCode.getText().toString().trim().matches("\\d+(?:\\.\\d+)?")){
            Toast.makeText(view.getContext(), "Inputan harus angka",
                    Toast.LENGTH_LONG).show();
        }
        else if(editTextPassword.getText().toString().length() >= 15){
            Toast.makeText(view.getContext(), "input password maksimal 15 karakter",
                    Toast.LENGTH_LONG).show();
        }
        else{
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }

    }

}
