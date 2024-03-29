package com.example.a5lonelyplanet;

/*

//import android.support.v13.app.FragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();

    private static final int NUM_PAGES = 5;

    private ImageView mIvCircle0;
    private ImageView mIvCircle1;
    private ImageView mIvCircle2;
    private ImageView mIvCircle3;
    private ImageView mIvCircle4;
    private Button mBtnExploreCities;

    /* Animation object */
/*    private Animation mDisappearBtnAnim;
    private Animation mScaleCircleAnim;

    /* Keeps track of the page position when swiping right and left */
/*    private int mPreviousPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.screen_slide);
        /* Inflate the view into java objects */
/*        mIvCircle0 = (ImageView)findViewById(R.id.circle0);
        mIvCircle1 = (ImageView)findViewById(R.id.circle1);
        mIvCircle2 = (ImageView)findViewById(R.id.circle2);
        mIvCircle3 = (ImageView)findViewById(R.id.circle3);
        mIvCircle4 = (ImageView)findViewById(R.id.circle4);

        /* Clear all animations */
/*        mIvCircle0.clearAnimation();
        mIvCircle1.clearAnimation();
        mIvCircle2.clearAnimation();
        mIvCircle3.clearAnimation();
        mIvCircle4.clearAnimation();

        /* Get the viewpager where are fragment will be displayed */
/*        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        /* Create a new ScreenSlidePageAdapter */
/*        PagerAdapter pagerAdapter = new ScreenSlidePageAdapter(getFragmentManager());
        /* Set the adapter to the viewpager */
/*        viewPager.setAdapter(pagerAdapter);

        /* Start the animations in there default starting position on first load - the first circle is scaled up */
/*        mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
        mIvCircle0.startAnimation(mScaleCircleAnim);
        /* All other circles are scaled down */
/*        mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
        mIvCircle1.startAnimation(mScaleCircleAnim);
        mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
        mIvCircle2.startAnimation(mScaleCircleAnim);
        mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
        mIvCircle3.startAnimation(mScaleCircleAnim);
        mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
        mIvCircle4.startAnimation(mScaleCircleAnim);

        /* Button that is displayed on the final page */
/*        mBtnExploreCities = (Button)findViewById(R.id.btnExploreCities);
        mDisappearBtnAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button_disappear);
        mBtnExploreCities.startAnimation(mDisappearBtnAnim);

        /* Listen for the swiping events */
/*        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                /* Ignore */
/*            }

            /*
               We need to establish if we are moving to the right or the left so we can scale down and up on the
               correct circles. We do this by keeping track of the position to see if it greater or less then the
               previous position
             */
 /*           @Override
            public void onPageSelected(int position) {
                boolean moveRight = false;
                /* if the position is greater than mPreviousPosition we are moving right else we are moving left */
/*                if (position > mPreviousPosition) {
                    moveRight = true;
                }

                Log.d(TAG, "onPageSelected position " + position);
                switch(position) {
                    case 0:
                        if (moveRight) {
                            Log.d(TAG, "MoveRight");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle0.startAnimation(mScaleCircleAnim);
                        }
                        else {
                            Log.d(TAG, "MoveLeft");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle0.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle1.startAnimation(mScaleCircleAnim);
                        }
                        break;

                    case 1:
                        if (moveRight) {
                            Log.d(TAG, "moveRight");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle0.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle1.startAnimation(mScaleCircleAnim);
                        }
                        else {
                            Log.d(TAG, "moveLeft");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle1.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle2.startAnimation(mScaleCircleAnim);
                        }
                        break;

                    case 2:
                        if (moveRight) {
                            Log.d(TAG, "moveRight");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle1.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle2.startAnimation(mScaleCircleAnim);
                        }
                        else {
                            Log.d(TAG, "moveLeft");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle2.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle3.startAnimation(mScaleCircleAnim);
                        }
                        break;

                    case 3:
                        if (moveRight) {
                            Log.d(TAG, "moveRight");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle2.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle3.startAnimation(mScaleCircleAnim);
                        }
                        else {
                            Log.d(TAG, "moveLeft");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle3.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle4.startAnimation(mScaleCircleAnim);

                            /* Make the button slowly disappear */
 /*                           mDisappearBtnAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button_disappear);
                            mBtnExploreCities.startAnimation(mDisappearBtnAnim);
                        }
                        break;

                    case 4:
                        if (moveRight) {
                            Log.d(TAG, "moveRight");
                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaledown_circle);
                            mIvCircle3.startAnimation(mScaleCircleAnim);

                            mScaleCircleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scaleup_circle);
                            mIvCircle4.startAnimation(mScaleCircleAnim);

                            /* Make the button slowly appear */
/*                            mDisappearBtnAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button_appear);
                            mBtnExploreCities.startAnimation(mDisappearBtnAnim);
                        }
                        else {
                            Log.d(TAG, "moveLeft");
                        }
                        break;
                }

                /* Update mPreviousPosition */
/*                mPreviousPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                /* Ignore */
/*            }
        });
    }

    /* Loads each fragment based on the position */
/*    public static class ScreenSlidePageAdapter extends FragmentPagerAdapter {
        private List<Fragment> mFragmentList = Collections.emptyList();

        public ScreenSlidePageAdapter(FragmentManager fm) {
            super(fm);

            /* Create an arrayList of fragments that will be used for the viewpager to navigate through */
/*            mFragmentList = new ArrayList<>();
            mFragmentList.add(new LoginFragment());
            mFragmentList.add(new CitiesFragment());
            mFragmentList.add(new MapsFragment());
            mFragmentList.add(new FavouriteFragment());
            mFragmentList.add(new OfflineFragment());
        }



        @Override
        public Fragment getItem(int position) {
            /* Return the fragment from the arrayList based on the position */
/*           return mFragmentList.get(position);

        }

        @Override
        public int getCount() {
            /* We need to return the number of pages - or nothing will show */
/*            return NUM_PAGES;
        }

    }
}
*/