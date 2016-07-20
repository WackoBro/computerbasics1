package com.quasar.paul.computerbasics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sharon on 7/17/2016.
 */
public class OperatingSystemScrollingActivity extends AppCompatActivity {

    String[] OperatingSystemList = {
            "Android",
            "Linux",
            "MAC OS",
            "MINIX",
            "OS/2",
            "Symbian",
            "Windows",
            "Unix"
    };

    String[] OperatingSystemDetails = {
        "Android is a mobile operating system developed by Google, based on the Linux kernel and designed primarily for touchscreen mobile devices such as smartphones and tablets. Android's user interface is mainly based on direct manipulation, using touch gestures that loosely correspond to real-world actions, such as swiping, tapping and pinching, to manipulate on-screen objects, along with a virtual keyboard for text input. In addition to touchscreen devices, Google has further developed Android TV for televisions, Android Auto for cars, and Android Wear for wrist watches, each with a specialized user interface. Variants of Android are also used on notebooks, game consoles, digital cameras, and other electronics.\n" +
                "Android has the largest installed base of all operating systems of any kind. Android has been the best selling OS on tablets since 2013, and on smartphones it is dominant by any metric.\n" +
                "Initially developed by Android, Inc., which Google bought in 2005, Android was unveiled in 2007 along with the founding of the Open Handset Alliance – a consortium of hardware, software, and telecommunication companies devoted to advancing open standards for mobile devices. As of July 2013, the Google Play store has had over one million Android applications (\"apps\") published, and over 50 billion applications downloaded. An April–May 2013 survey of mobile application developers found that 71% of developers create applications for Android, and a 2015 survey found that 40% of full-time professional developers see Android as their priority target platform, which is comparable to Apple's iOS on 37% with both platforms far above others. In September 2015, Android had 1.4 billion monthly active users.\n" +
                "Android's source code is released by Google under open source licenses, although most Android devices ultimately ship with a combination of open source and proprietary software, including proprietary software required for accessing Google services. Android is popular with technology companies that require a ready-made, low-cost and customizable operating system for high-tech devices. At the same time, as Android has no centralised update system most Android devices fail to receive security updates: research in 2015, concluded that almost 90% of Android phones in use had known but unpatched security vulnerabilities due to lack of updates and support. Its open nature has encouraged a large community of developers and enthusiasts to use the open-source code as a foundation for community-driven projects, which deliver updates to older devices, add new features for advanced users or bring Android to devices originally shipped with other operating systems. The success of Android has made it a target for patent litigation as part of the so-called \"smartphone wars\" between technology companies.",
            "Linux  is a Unix-like and mostly POSIX-compliant computer operating system (OS) assembled under the model of free and open-source software development and distribution. The defining component of Linux is the Linux kernel, an operating system kernel first released on October 5, 1991 by Linus Torvalds. The Free Software Foundation uses the name GNU/Linux to describe the operating system, which has led to some controversy.\n" +
                    "Linux was originally developed as a free operating system for personal computers based on the Intel x86 architecture, but has since been ported to more computer hardware platforms than any other operating system. Because of the dominance of Android on smartphones, Linux has the largest installed base of all general-purpose operating systems. Linux, in its original form, is also the leading operating system on servers and other big iron systems such as mainframe computers and virtually all fastest supercomputers, but is used on only around 1.6% of desktop computers when not including Chrome OS, which has about 5% of the overall and nearly 20% of the sub-$300 notebook sales. Linux also runs on embedded systems, which are devices whose operating system is typically built into the firmware and is highly tailored to the system; this includes smartphones and tablet computers running Android and other Linux derivatives, TiVo and similar DVR devices, network routers, facility automation controls, televisions, video game consoles and smartwatches.\n" +
                    "The development of Linux is one of the most prominent examples of free and open-source software collaboration. The underlying source code may be used, modified and distributed—GNU General Public License. Typically, Linux is packaged in a form known as a Linux distribution (or distro for short) for both desktop and server use. Some of the most popular mainstream Linux distributions are Arch Linux, CentOS, Debian, Fedora, Gentoo Linux, Linux Mint, Mageia, openSUSE and Ubuntu, together with commercial distributions such as Red Hat Enterprise Linux and SUSE Linux Enterprise Server. Distributions include the Linux kernel, supporting utilities and libraries, many of which are provided by the GNU Project, and usually a large amount of application software to fulfil the distribution's intended use.\n" +
                    "Distributions oriented toward desktop use typically include a windowing system, such as X11, Mir or a Wayland implementation, and an accompanying desktop environment such as GNOME or the KDE Software Compilation; some distributions may also include a less resource-intensive desktop, such as LXDE or Xfce. Distributions intended to run on servers may omit all graphical environments from the standard install, and instead include other software to set up and operate a solution stack such as LAMP. Because Linux is freely redistributable, anyone may create a distribution for any intended use.",
            "Mac OS is a series of graphical user interface–based operating systems developed by Apple Inc. for their Macintosh line of computer systems.\n" +
                    "The original operating system was first introduced in 1984 as being integral to the original Macintosh, and referred to as the \"System\". Referred to by its major revision starting with \"System 6\" and \"System 7\", Apple rebranded version 7.6 as \"Mac OS\" as part of their Macintosh clone program in 1996. The Macintosh, specifically its system software, is credited with having popularized the early graphical user interface concept.\n" +
                    "There are two architectural legacies of Mac OS. Up to major revision 9, from 1984 to 2000, it is historically known as Classic Mac OS. Major revision 10, from 2001 to present, was originally branded \"Mac OS X\", renamed to \"OS X\" in 2012, and announced to be renamed to \"macOS\" in the upcoming version in 2016. Both legacies share a general interface design, and there has been some overlap of application frameworks for compatibility; but the two systems have different origins and use deeply different architectures.",
            "MINIX (from \"mini-Unix\") is a POSIX-compliant, Unix-like computer operating system based on a microkernel architecture.\n" +
                    "Early versions of MINIX were created by Andrew S. Tanenbaum for educational purposes. Starting with MINIX 3, the primary aim of development shifted from education to the creation of a highly reliable and self-healing microkernel OS. MINIX is now developed as open-source software.\n" +
                    "MINIX was first released in 1987, with its complete source code made available to universities for study in courses and research. It has been free and open source software since it was re-licensed under the BSD license in April 2000.",
            "OS/2 is a series of computer operating systems, initially created by Microsoft and IBM, then later developed by IBM exclusively. The name stands for \"Operating System/2\", because it was introduced as part of the same generation change release as IBM's \"Personal System/2 (PS/2)\" line of second-generation personal computers. The first version of OS/2 was released in December 1987 and newer versions were released until December 2001.\n" +
                    "OS/2 was intended as a protected mode successor of PC DOS. Notably, basic system calls were modelled after MS-DOS calls; their names even started with \"Dos\" and it was possible to create \"Family Mode\" applications: text mode applications that could work on both systems. Because of this heritage, OS/2 shares similarities with Unix, Xenix, and Windows NT in many ways.\n" +
                    "IBM discontinued its support for OS/2 on 31 December 2006. Since then, it has been updated, maintained and marketed under the name eComStation. In 2015 it was announced that a new OEM distribution of OS/2 would be released that was to be called ArcaOS.",
            "Symbian was a mobile operating system (OS) and computing platform designed for smartphones. Symbian was originally developed as a closed-source OS for PDAs in 1998 by Symbian Ltd.. Symbian OS was a descendant of Psion's EPOC, and runs exclusively on ARM processors, although an unreleased x86 port existed. Symbian was used by many major mobile phone brands, like Samsung, Motorola, Sony Ericsson, and above all by Nokia. As a pioneer that established the smartphone industry, it was the most popular smartphone OS on a worldwide average until the end of 2010 – at a time when smartphones were in limited use, when it was overtaken by Android, as Google and its partners achieved wide adoption.\n" +
                    "Symbian OS was (from 2001) essentially a shell system and required an additional user interface (as middleware) to form a complete operating system. Symbian OS became prominent from the S60 (formerly Series 60) platform built by Nokia, first released in 2002 and powering most Nokia smartphones. Symbian eventually became the most widely used smart mobile operating system. UIQ was another Symbian user interface mostly used by Motorola and Sony Ericsson, whereas in Japan there was also the MOAP platform. Applications of these interfaces were not compatible with each other, despite each being built atop Symbian OS. Nokia was the majority shareholder in Symbian Ltd. and purchased the entire share in 2008. The non-profit Symbian Foundation was then created to make a royalty-free successor to Symbian OS - seeking to unify the platform, S60 became the Foundation's favoured UI and UIQ stopped development. Symbian^1 (or S60 5th Edition) was created as a result in 2009. Symbian^2 was only used by carrier NTT DoCoMo, one of the members of the Foundation, for the Japanese market. Symbian^3 was released as in 2010, by which time it became fully open source. Symbian^3 received the Anna and Belle updates in 2011.\n" +
                    "The Symbian Foundation disintegrated in late 2010 and Nokia took back control of the OS development. In February 2011, Nokia, by now the only remaining company still supporting Symbian outside Japan, announced that it would use Microsoft's Windows Phone 7 as its primary smartphone platform, whilst Symbian would be gradually wound down. Two months later, Nokia moved the OS to closed licensing., and later outsourced Symbian development to Accenture. Although support was promised until 2016, there was little development from Accenture, where most Symbian developers had already left by 2012. In January 2014, Nokia stopped accepting new or changed Symbian software from developers.\n" +
                    "The Nokia 808 PureView is officially the last Symbian smartphone from Nokia. However NTT DoCoMo have continued releasing OPP(S) (Operator Pack Symbian, successor of MOAP) devices in Japan, which still act as middleware on top of Symbian. Phones running this include the F-07F from Fujitsu and SH-07F from Sharp in 2014.",
            "Microsoft Windows (or simply Windows) is a metafamily of graphical operating systems developed, marketed, and sold by Microsoft. It consists of several families of operating systems, each of which cater to a certain sector of the computing industry. Active Windows families include Windows NT, Windows Embedded and Windows Phone; these may encompass subfamilies, e.g. Windows Embedded Compact (Windows CE) or Windows Server. Defunct Windows families include Windows 9x and Windows Mobile.\n" +
                    "Microsoft introduced an operating environment named Windows on November 20, 1985, as a graphical operating system shell for MS-DOS in response to the growing interest in graphical user interfaces (GUIs). Microsoft Windows came to dominate the world's personal computer market with over 90% usage share, overtaking Mac OS, which had been introduced in 1984.\n" +
                    "As of March 2016, the most recent version of Windows for personal computers, tablets, smartphones and embedded devices is Windows 10. The most recent versions for server computers is Windows Server 2012 R2. A specialized version of Windows runs on the Xbox One game console.",
            "Unix (trademarked as UNIX) is a family of multitasking, multiuser computer operating systems that derive from the original AT&T Unix, developed in the 1970s at the Bell Labs research center by Ken Thompson, Dennis Ritchie, and others.\n" +
                    "Initially intended for use inside the Bell System, AT&T licensed Unix to outside parties from the late 1970s, leading to a variety of both academic and commercial variants of Unix from vendors such as the University of California, Berkeley (BSD), Microsoft (Xenix), IBM (AIX) and Sun Microsystems (Solaris). AT&T finally sold its rights in Unix to Novell in the early 1990s, which then sold its Unix business to the Santa Cruz Operation (SCO) in 1995, but the UNIX trademark passed to the industry standards consortium The Open Group, which allows the use of the mark for certified operating systems compliant with the Single UNIX Specification (SUS). Among these is Apple's macOS, which is the Unix version with the largest installed base as of 2014.\n" +
                    "From the power user's or programmer's perspective, Unix systems are characterized by a modular design that is sometimes called the \"Unix philosophy\", meaning that the operating system provides a set of simple tools that each perform a limited, well-defined function, with a unified filesystem as the main means of communication and a shell scripting and command language to combine the tools to perform complex workflows. Aside from the modular design, Unix also distinguishes itself from its predecessors as the first portable operating system: almost the entire operating system is written in the C programming language that allowed Unix to reach numerous platforms."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_system_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int position =  getIntent().getExtras().getInt("Position");
        setTitle(OperatingSystemList[position]);


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String mDrawableName = "operating_system_" + position;
        if(getResources().getIdentifier(mDrawableName, "drawable", getPackageName())== 0) {
            mDrawableName = "operating_system";
        }

        int resId = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
        imageView.setImageResource(resId);



        TextView textView = (TextView) findViewById(R.id.context_text);
        assert textView != null;
        textView.setText(OperatingSystemDetails[position]);
        if(getResources().getIdentifier(mDrawableName, "drawable", getPackageName())== 0) {
            TextView newText = (TextView) findViewById(R.id.context_text);
            assert newText != null;
            textView.setText("Crap");
        }



    }
}