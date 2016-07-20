package com.quasar.paul.computerbasics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sharon on 7/17/2016.
 */
public class OfficeSrollingActivity extends AppCompatActivity {

    String[] OfficeList = {
            "Microsoft Word",
            "Microsoft Excel",
            "PowerPoint",
            "Access",
            "Outlook",
            "OneNote",
            "Sway"
    };

    String[] OfficeDetails = {

            "Microsoft Word is a word processor available for Windows and OS X. Word is also available in some editions of Microsoft Works. The first version of Word, released in the autumn of 1983, was for the MS-DOS operating system and had the distinction of introducing the mouse to a broad population. Word 1.0 could be purchased with a bundled mouse, though none was required. Following the precedents of LisaWrite and MacWrite, Word for Macintosh attempted to add closer WYSIWYG features into its package. Word for Mac was released in 1985. Word for Mac was the first graphical version of Microsoft Word.\n" +
                "Its proprietary Doc format is a de facto standard, although Word 2007 deprecated this format in favor of Office Open XML, which was later standardized by Ecma International as an open format. Support for Portable Document Format (PDF) and OpenDocument (ODF) was first introduced in Word for Windows with Service Pack 2 for Word 2007.",
            "Microsoft Excel is a spreadsheet program that originally competed with the dominant Lotus 1-2-3, and eventually outsold it. It is available for the Windows and OS X platforms. Microsoft released the first version of Excel for the Mac OS in 1985, and the first Windows version (numbered 2.05 to line up with the Mac and bundled with a standalone Windows run-time environment) in November 1987. It provided more functionality than the previous version.",
            "Microsoft PowerPoint is a presentation program for Windows and OS X. It is used to create slideshows, composed of text, graphics, and other objects, which can be displayed on-screen and shown by the presenter or printed out on transparencies or slides.",
            "Microsoft Access is a database management system for Windows that combines the relational Microsoft Jet Database Engine with a graphical user interface and software-development tools. Microsoft Access stores data in its own format based on the Access Jet Database Engine. It can also import or link directly to data stored in other applications and databases.",
            "Microsoft Outlook (not to be confused with Outlook Express) is a personal information manager. The replacement for Windows Messaging, Microsoft Mail, and Schedule+ starting in Office 97, it includes an e-mail client, calendar, task manager and address book.\n" +
                    "On the Mac OS, Microsoft offered several versions of Outlook in the late 1990s, but only for use with Microsoft Exchange Server. In Office 2001, it introduced an alternative application with a slightly different feature set called Microsoft Entourage. It reintroduced Outlook in Office 2011, replacing Entourage.",
            "Microsoft OneNote is a freeware notetaking program. It gathers notes (handwritten or typed), drawings, screen clippings and audio commentaries. Notes can be shared with other OneNote users over the Internet or a network. OneNote was initially introduced as a standalone app that was not included in any of Microsoft Office 2003 editions. However, OneNote eventually became a core component of Microsoft Office; with the release of Microsoft Office 2013, OneNote was included in all Microsoft Office offerings before eventually becoming completely free of charge. OneNote is available as a web application on Office Online, a Windows desktop app, a mobile app for Windows Phone, iOS, Android, and Symbian, and a Metro-style app for Windows 8 or later.",
            "Microsoft Sway is a presentation app that allows users to create an interactive website combining text, images, and other media. Sway was originally released in August of 2015. Sway is tied with the user's Microsoft account, where the Sways that the user creates are stored. Sway is available as a web app or mobile app and is included with Windows 10 Mobile."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int position =  getIntent().getExtras().getInt("Position");
        setTitle(OfficeList[position]);



        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String mDrawableName = "office_" + position;
        if(getResources().getIdentifier(mDrawableName, "drawable", getPackageName())== 0) {
            mDrawableName = "office";
        }

        int resId = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
        imageView.setImageResource(resId);



        TextView textView = (TextView) findViewById(R.id.context_text);
        assert textView != null;
        textView.setText(OfficeDetails[position]);
        if(getResources().getIdentifier(mDrawableName, "drawable", getPackageName())== 0) {
            TextView newText = (TextView) findViewById(R.id.context_text);
            assert newText != null;
            textView.setText("Crap");
        }



    }
}