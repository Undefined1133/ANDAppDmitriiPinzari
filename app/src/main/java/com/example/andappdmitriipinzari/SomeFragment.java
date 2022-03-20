package com.example.andappdmitriipinzari;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SomeFragment extends Fragment {
MediaController mediaController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
    View view = inflater.inflate(R.layout.fragment_some,container,false);
        VideoView videoView = view.findViewById(R.id.videoView);

videoView.setVideoPath("android.resource://" + getActivity().getPackageName()+"/"+R.raw.appavideo);
mediaController = new MediaController(view.getContext());
mediaController.setAnchorView(videoView);
videoView.setMediaController(mediaController);
videoView.start();
        return view;
    }
}

