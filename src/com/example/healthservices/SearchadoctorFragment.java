package com.example.healthservices;

import java.security.PublicKey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SearchadoctorFragment extends Fragment {
	Button searchbtn_searchdocs;
	int city = 0, speciality = 0, num_value;
	ImageView imageview2, imageview1, imageview3, imageview4,imageview5,imageview6,imageview7,imageview8,imageview9,imageview10,imageview11,imageview12,imageview13,imageview14,imageview15,imageview16;
    
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v;
		v = inflater.inflate(R.layout.searchadoctor_layout, container, false);
		imageview1 = (ImageView) v
				.findViewById(R.id.imageView1);
		imageview2 = (ImageView) v.findViewById(R.id.imageView2);
		imageview3 = (ImageView) v.findViewById(R.id.imageView3);
		imageview4 = (ImageView) v.findViewById(R.id.imageView4);
		imageview5 = (ImageView) v.findViewById(R.id.imageView5);
		imageview6 = (ImageView) v.findViewById(R.id.imageView6);
		imageview7 = (ImageView) v
				.findViewById(R.id.imageView7);
		imageview8 = (ImageView) v
				.findViewById(R.id.imageView8);
		imageview9 = (ImageView) v
				.findViewById(R.id.imageView9);
		imageview10 = (ImageView) v
				.findViewById(R.id.imageView10);
		imageview11 = (ImageView) v
				.findViewById(R.id.imageView11);
		imageview12 = (ImageView) v
				.findViewById(R.id.imageView12);
		imageview13 = (ImageView) v
				.findViewById(R.id.imageView13);
		imageview14 = (ImageView) v
				.findViewById(R.id.imageView14);
		imageview15 = (ImageView) v
				.findViewById(R.id.imageView15);
		imageview16 = (ImageView) v
				.findViewById(R.id.imageView16);

		searchbtn_searchdocs = (Button) v
				.findViewById(R.id.searchbtn_searchdoc);
		imageview1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview1.setImageResource(R.drawable.cschemecopy);
				Toast.makeText(getActivity(), "Now tap on a speciality!",Toast.LENGTH_SHORT).show();
				show();
				city = 1;
			}
		});

		imageview2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview2.setImageResource(R.drawable.malviyanagarcopy);
				Toast.makeText(getActivity(), "Now tap on a speciality!",Toast.LENGTH_SHORT).show();
				show();
				city = 2;
			}
		});

		imageview3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview3.setImageResource(R.drawable.mansarovarcopy);
				Toast.makeText(getActivity(), "Now tap on a speciality!",Toast.LENGTH_SHORT).show();
				show();
				city = 3;
			}
		});

		imageview5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview5.setImageResource(R.drawable.miroadcopy);
				Toast.makeText(getActivity(), "Now tap on a speciality!",Toast.LENGTH_SHORT).show();
				show();
				city = 4;
			}
		});

		imageview4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview4.setImageResource(R.drawable.rajaparkcopy);
				Toast.makeText(getActivity(), "Now tap on a speciality!",Toast.LENGTH_SHORT).show();
				show();
				city = 5;
			}
		});

		imageview6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview6.setImageResource(R.drawable.civillinescopy);
				Toast.makeText(getActivity(), "Now tap on a speciality!",Toast.LENGTH_SHORT).show();
				show();
				city = 6;
			}
		});

		imageview7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				imageview7.setImageResource(R.drawable.onecopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality=1;
			}
		});
		imageview8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview8.setImageResource(R.drawable.twocopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 2;
			}
		});
		imageview9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview9.setImageResource(R.drawable.threecopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 3;
			}
		});
		imageview10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview10.setImageResource(R.drawable.fourcopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 4;
			}
		});
		imageview11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview11.setImageResource(R.drawable.fivecopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 5;
			}
		});
		imageview12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview12.setImageResource(R.drawable.sixcopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 6;
			}
		});
		imageview13.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview13.setImageResource(R.drawable.sevencopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 7;
			}
		});
		imageview14.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview14.setImageResource(R.drawable.eightcopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 8;
			}
		});
		imageview15.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				imageview15.setImageResource(R.drawable.ninecopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 9;
			}
		});
		imageview16.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				imageview16.setImageResource(R.drawable.tencopy);
				Toast.makeText(getActivity(), "Ready to search!",Toast.LENGTH_SHORT).show();
				show1();
				speciality = 10;
			}
		});

		num_value = city * 10 + speciality;

		searchbtn_searchdocs.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent openshowsearchdocs = new Intent(
						"com.example.healthservices.SHOWSEARCHEDDOCS");
				openshowsearchdocs.putExtra("mynum", num_value);
				startActivity(openshowsearchdocs);
			}

		});

		return v;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		imageview2.setImageResource(R.drawable.malviyanagar);
		imageview1.setImageResource(R.drawable.cscheme);
		imageview3.setImageResource(R.drawable.mansarovar);
		imageview5.setImageResource(R.drawable.miroad);
		imageview4.setImageResource(R.drawable.rajapark);
		imageview6.setImageResource(R.drawable.civillines);
		imageview7.setImageResource(R.drawable.one);
		imageview8.setImageResource(R.drawable.two);
		imageview9.setImageResource(R.drawable.three);
		imageview10.setImageResource(R.drawable.four);
		imageview11.setImageResource(R.drawable.five);
		imageview12.setImageResource(R.drawable.six);
		imageview13.setImageResource(R.drawable.seven);
		imageview14.setImageResource(R.drawable.eight);
		imageview15.setImageResource(R.drawable.nine);
		imageview16.setImageResource(R.drawable.ten);
		
		
	}
	public void show()
	{
		switch (city) {
		case 0:
			
			break;
		case 1:imageview1.setImageResource(R.drawable.cscheme);
			
			break;
		case 2:imageview2.setImageResource(R.drawable.malviyanagar);
			
			break;
		case 3:imageview3.setImageResource(R.drawable.mansarovar);
	
			break;
		case 4:imageview5.setImageResource(R.drawable.miroad);
	
			break;
		case 5:imageview4.setImageResource(R.drawable.rajapark);
			
			break;
		case 6:imageview6.setImageResource(R.drawable.civillines);
	
	        break;

		default:
			break;
		}
		
	

}
	public void show1()
	{switch (speciality) {
	case 0:
		
		break;
case 1:imageview7.setImageResource(R.drawable.one);
		
		break;
case 2:imageview8.setImageResource(R.drawable.two);
	
	break;
case 3:imageview9.setImageResource(R.drawable.three);
	
	break;
case 4:imageview10.setImageResource(R.drawable.four);
	
	break;
case 5:imageview11.setImageResource(R.drawable.five);
	
	break;
case 6:imageview12.setImageResource(R.drawable.six);
	
	break;
case 7:imageview13.setImageResource(R.drawable.seven);
	
	break;
case 8:imageview14.setImageResource(R.drawable.eight);
	
	break;
case 9:imageview15.setImageResource(R.drawable.nine);
	
	break;
case 10:imageview16.setImageResource(R.drawable.ten);
	
	break;

	default:
		break;
	}

}
}
