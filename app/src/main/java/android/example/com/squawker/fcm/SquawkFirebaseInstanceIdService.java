package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class SquawkFirebaseInstanceIdService  extends FirebaseInstanceIdService{

    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {
        String refershToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOG_TAG, "Refershed Token:" + refershToken);
        sendRegistrationToServer(refershToken);

    }

    private void sendRegistrationToServer(String message)
    {

    }
}
