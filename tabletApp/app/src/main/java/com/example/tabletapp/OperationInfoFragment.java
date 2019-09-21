package com.example.tabletapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class OperationInfoFragment  extends Fragment {

    ImageButton mOperationStatusImageButton,mSendNotificationImageButton,mBroadcastAudioImageButton;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.operation_info_fragment, container, false);
        mOperationStatusImageButton = (ImageButton) rootView.findViewById(R.id.operation_status_image_button);
        mSendNotificationImageButton = (ImageButton) rootView.findViewById(R.id.broadcast_notification_image_button);
        mBroadcastAudioImageButton = (ImageButton) rootView.findViewById(R.id.broadcast_voice_note_image_button);

        return rootView;
    }
}
