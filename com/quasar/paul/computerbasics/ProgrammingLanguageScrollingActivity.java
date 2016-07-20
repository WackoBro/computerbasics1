package com.quasar.paul.computerbasics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sharon on 7/17/2016.
 */
public class ProgrammingLanguageScrollingActivity  extends AppCompatActivity {

    String[] ProgrammingLanguagesList = {
            "ActionScript",
            "BASIC",
            "Bourne Shell",
            "C",
            "C++",
            "CUDA",
            "D",
            "E",
            "Fortran",
            "Go",
            "Hack",
            "Haskell",
            "Java",
            "Javascript",
            "LaTeX",
            "Logo",
            "MATLAB",
            "Objective-C",
            "Pascal",
            "Perl",
            "PHP",
            "Python",
            "Swift (Apple programming language)",
            "Swift (parallel scripting language)",
            "Unix shell",

    };

    String[] ProgrammingLanguagesDetails = {
        "ActionScript is an object-oriented programming language originally developed by Macromedia Inc. (since merged into Adobe Systems). It is a derivation of HyperTalk, the scripting language for HyperCard. It is now a dialect of ECMAScript (meaning it is a superset of the syntax and semantics of the language more widely known as JavaScript), though it originally arose as a sibling, both being influenced by HyperTalk.\n" +
                "ActionScript is used primarily for the development of websites and software targeting the Adobe Flash Player platform, used on Web pages in the form of embedded SWF files.\n" +
                "ActionScript 3 is also used with Adobe AIR system for the development of desktop and mobile applications. The language itself is open-source in that its specification is offered free of charge and both an open source compiler (as part of Apache Flex) and open source virtual machine (Mozilla Tamarin) are available.\n" +
                "ActionScript is also used with Scaleform GFx for the development of 3D video game user interfaces and HUDs.",
            "BASIC (an acronym for Beginner's All-purpose Symbolic Instruction Code) is a family of general-purpose, high-level programming languages whose design philosophy emphasizes ease of use.\n" +
                    "In 1964, John G. Kemeny and Thomas E. Kurtz designed the original BASIC language at Dartmouth College in New Hampshire. They wanted to enable students in fields other than science and mathematics to use computers. At the time, nearly all use of computers required writing custom software, which was something only scientists and mathematicians tended to learn.\n" +
                    "Versions of BASIC became widespread on microcomputers in the mid-1970s and 1980s. Microcomputers usually shipped with BASIC, often in the machine's firmware. Having an easy-to-learn language on these early personal computers allowed small business owners, professionals, hobbyists, and consultants to develop custom software on computers they could afford.\n" +
                    "BASIC remains popular in many dialects and in new languages influenced by BASIC, such as Microsoft's Visual Basic. In 2006, 59% of developers for the .NET Framework used Visual Basic .NET as their only programming language.",
            "The Bourne shell (sh) is a shell, or command-line interpreter, for computer operating systems.\n" +
                    "The Bourne shell was the default shell for Unix Version 7. Most Unix-like systems continue to have /bin/sh—which will be the Bourne shell, or a symbolic link or hard link to a compatible shell even when other shells are used by most users.\n" +
                    "Developed by Stephen Bourne at Bell Labs, it was a replacement for the Thompson shell, whose executable file had the same name—sh. It was released in 1977 in the Version 7 Unix release distributed to colleges and universities. Although it is used as an interactive command interpreter, it was also intended as a scripting language and contains most of the features that are commonly considered to produce structured programs.\n" +
                    "It gained popularity with the publication of The Unix Programming Environment by Brian Kernighan and Rob Pike—the first commercially published book that presented the shell as a programming language in a tutorial form.",
            "C  is a general-purpose, imperative computer programming language, supporting structured programming, lexical variable scope and recursion, while a static type system prevents many unintended operations. By design, C provides constructs that map efficiently to typical machine instructions, and therefore it has found lasting use in applications that had formerly been coded in assembly language, including operating systems, as well as various application software for computers ranging from supercomputers to embedded systems.\n" +
                    "C was originally developed by Dennis Ritchie between 1969 and 1973 at Bell Labs, and used to re-implement the Unix operating system. It has since become one of the most widely used programming languages of all time, with C compilers from various vendors available for the majority of existing computer architectures and operating systems. C has been standardized by the American National Standards Institute (ANSI) since 1989 (see ANSI C) and subsequently by the International Organization for Standardization (ISO).",
            "C++  is a general-purpose programming language. It has imperative, object-oriented and generic programming features, while also providing facilities for low-level memory manipulation.\n" +
                    "It was designed with a bias toward system programming and embedded, resource-constrained and large systems, with performance, efficiency and flexibility of use as its design highlights. C++ has also been found useful in many other contexts, with key strengths being software infrastructure and resource-constrained applications, including desktop applications, servers (e.g. e-commerce, web search or SQL servers), and performance-critical applications (e.g. telephone switches or space probes). C++ is a compiled language, with implementations of it available on many platforms and provided by various organizations, including the Free Software Foundation (FSF's GCC), LLVM, Microsoft, Intel and IBM.\n" +
                    "C++ is standardized by the International Organization for Standardization (ISO), with the latest standard version ratified and published by ISO in December 2014 as ISO/IEC 14882:2014 (informally known as C++14). The C++ programming language was initially standardized in 1998 as ISO/IEC 14882:1998, which was then amended by the C++03, ISO/IEC 14882:2003, standard. The current C++14 standard supersedes these and C++11, with new features and an enlarged standard library. Before the initial standardization in 1998, C++ was developed by Bjarne Stroustrup at Bell Labs since 1979, as an extension of the C language as he wanted an efficient and flexible language similar to C, which also provided high-level features for program organization.\n" +
                    "Many other programming languages have been influenced by C++, including C#, Java, and newer versions of C (after 1998).",
            "CUDA is a parallel computing platform and application programming interface (API) model created by NVIDIA. It allows software developers to use a CUDA-enabled graphics processing unit (GPU) for general purpose processing – an approach known as GPGPU. The CUDA platform is a software layer that gives direct access to the GPU's virtual instruction set and parallel computational elements, for the execution of compute kernels.\n" +
                    "The CUDA platform is designed to work with programming languages such as C, C++ and Fortran. This accessibility makes it easier for specialists in parallel programming to utilize GPU resources, as opposed to previous API solutions like Direct3D and OpenGL, which required advanced skills in graphics programming. Also, CUDA supports programming frameworks such as OpenACC and OpenCL. When it was first introduced by NVIDIA, the name CUDA was an acronym for Compute Unified Device Architecture, but NVIDIA subsequently dropped the use of the acronym.",
            "The D programming language is an object-oriented, imperative, multi-paradigm system programming language created by Walter Bright of Digital Mars and released in 2001. Bright was joined in the design and development effort in 2007 by Andrei Alexandrescu. Though it originated as a re-engineering of C++, D is a distinct language, having redesigned some core C++ features while also taking inspiration from other languages, notably Java, Python, Ruby, C#, and Eiffel.\n" +
                    "D's design goals attempt to combine the performance and safety of compiled languages with the expressive power of modern dynamic languages. Idiomatic D code is commonly as fast as equivalent C++ code, while being shorter and memory-safe.\n" +
                    "Type inference, automatic memory management and syntactic sugar for common types allow faster development, while bounds checking, design by contract features and a concurrency-aware type system help reduce the occurrence of bugs.",
            "E is an object-oriented programming language for secure distributed computing, created by Mark S. Miller, Dan Bornstein, and others at Electric Communities in 1997. E is mainly descended from the concurrent language Joule and from Original-E, a set of extensions to Java for secure distributed programming. E combines message-based computation with Java-like syntax. A concurrency model based on event loops and promises ensures that deadlock can never occur.",
            "Fortran (formerly FORTRAN, derived from \"Formula Translation\") is a general-purpose, imperative programming language that is especially suited to numeric computation and scientific computing. Originally developed by IBM in the 1950s for scientific and engineering applications, Fortran came to dominate this area of programming early on and has been in continuous use for over half a century in computationally intensive areas such as numerical weather prediction, finite element analysis, computational fluid dynamics, computational physics and computational chemistry. It is a popular language for high-performance computing and is used for programs that benchmark and rank the world's fastest supercomputers.\n" +
                    "Fortran encompasses a lineage of versions, each of which evolved to add extensions to the language while usually retaining compatibility with prior versions. Successive versions have added support for structured programming and processing of character-based data (FORTRAN 77), array programming, modular programming and generic programming (Fortran 90), high performance Fortran (Fortran 95), object-oriented programming (Fortran 2003) and concurrent programming (Fortran 2008).",
            "Go (often referred to as golang) is an open source programming language created at Google in 2007 by Robert Griesemer, Rob Pike, and Ken Thompson. It is a compiled, statically typed language in the tradition of Algol and C, with garbage collection, limited structural typing, memory safety features and CSP-style concurrent programming features added.\n" +
                    "The language was announced in November 2009; it is used in some of Google's production systems, as well as by other firms. Two major implementations exist: Google's Go compiler, \"gc\", is developed as open source software and targets various platforms including Linux, OS X, Windows, various BSD and Unix versions, and since 2015 also mobile devices, including smartphones. A second compiler, gccgo, is a GCC frontend. The \"gc\" toolchain is self-hosting since version 1.5.",
            "Hack is a programming language for the HipHop Virtual Machine (HHVM), created by Facebook as a dialect of PHP. The language implementation is open-source, licensed under the BSD License.\n" +
                    "Hack allows programmers to use both dynamic typing and static typing. This kind of a type system is called gradual typing, which is also implemented in other programming languages such as ActionScript. Hack's type system allows types to be specified for function arguments, function return values, and class properties; however, types of local variables are always inferred and cannot be specified.",
            "Haskell  is a standardized, general-purpose purely functional programming language, with non-strict semantics and strong static typing. It is named after logician Haskell Curry. The latest standard of Haskell is Haskell 2010. As of May 2016, a group is working on the next version, Haskell 2020.\n" +
                    "Haskell features a type system with type inference and lazy evaluation. Type classes first appeared in the Haskell programming language. Its main implementation is the Glasgow Haskell Compiler.\n" +
                    "Haskell is based on the semantics, but not the syntax, of the language Miranda, which served to focus the efforts of the initial Haskell working group. Haskell is used widely in academia and also used in industry.",
            "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use, particularly for client-server web applications, with a reported 9 million developers. Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.\n" +
                    "The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licences. As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).\n" +
                    "The latest version is Java 8, which is the only version currently supported for free by Oracle, although earlier versions are supported both by Oracle and other companies on a commercial basis.",
            "JavaScript  is a high-level, dynamic, untyped, and interpreted programming language. It has been standardized in the ECMAScript language specification. Alongside HTML and CSS, it is one of the three core technologies of World Wide Web content production; the majority of websites employ it and it is supported by all modern Web browsers without plug-ins. JavaScript is prototype-based with first-class functions, making it a multi-paradigm language, supporting object-oriented, imperative, and functional programming styles. It has an API for working with text, arrays, dates and regular expressions, but does not include any I/O, such as networking, storage, or graphics facilities, relying for these upon the host environment in which it is embedded.\n" +
                    "Although there are strong outward similarities between JavaScript and Java, including language name, syntax, and respective standard libraries, the two are distinct languages and differ greatly in their design. JavaScript was influenced by programming languages such as Self and Scheme.\n" +
                    "JavaScript is also used in environments that are not Web-based, such as PDF documents, site-specific browsers, and desktop widgets. Newer and faster JavaScript virtual machines (VMs) and platforms built upon them have also increased the popularity of JavaScript for server-side Web applications. On the client side, JavaScript has been traditionally implemented as an interpreted language, but more recent browsers perform just-in-time compilation. It is also used in game development, the creation of desktop and mobile applications, and server-side network programming with run-time environments such as Node.js.",
            "LaTeX  is a document preparation system. When writing, the writer uses plain text as opposed to formatted text, as in WYSIWYG word processors like Microsoft Word or LibreOffice Writer. The writer uses markup tagging conventions to define the general structure of a document (such as article, book, and letter), to stylise text throughout a document (such as bold and italic), and to add citations and cross-references. A TeX distribution such as TeX Live or MikTeX is used to produce an output file (such as PDF or DVI) suitable for printing or digital distribution. Within the typesetting system, its name is stylised as LaTeX.\n" +
                    "LaTeX is used for the communication and publication of scientific documents in many fields, including mathematics, physics, computer science, statistics, economics, and political science. It also has a prominent role in the preparation and publication of books and articles that contain complex multilingual materials, such as Sanskrit and Arabic. LaTeX uses the TeX typesetting program for formatting its output, and is itself written in the TeX macro language.\n" +
                    "LaTeX is widely used in academia. LaTeX can be used as a standalone document preparation system, or as an intermediate format. In the latter role, for example, it is sometimes used as part of a pipeline for translating DocBook and other XML-based formats to PDF. The typesetting system offers programmable desktop publishing features and extensive facilities for automating most aspects of typesetting and desktop publishing, including numbering and cross-referencing of tables and figures, chapter and section headings, the inclusion of graphics, page layout, indexing and bibliographies.\n" +
                    "Like TeX, LaTeX started as a writing tool for mathematicians and computer scientists, but from early in its development it has also been taken up by scholars who needed to write documents that include complex math expressions or non-Latin scripts, such as Arabic, Sanskrit and Chinese.\n" +
                    "LaTeX is intended to provide a high-level language that accesses the power of TeX in an easier way for writers. In short, TeX handles the layout side, while LaTeX handles the content side for document processing. LaTeX comprises a collection of TeX macros and a program to process LaTeX documents. Because the plain TeX formatting commands are elementary, it provides authors with ready-made commands for formatting and layout requirements such as chapter headings, footnotes, cross-references and bibliographies.\n" +
                    "LaTeX was originally written in the early 1980s by Leslie Lamport at SRI International. The current version is LaTeX2e (stylised as LaTeX2ε). LaTeX is free software and is distributed under the LaTeX Project Public License (LPPL).",
            "Logo is an educational programming language, designed in 1967 by Daniel G. Bobrow, Wally Feurzeig, Seymour Papert and Cynthia Solomon. Today the language is remembered mainly for its use of turtle graphics, in which commands for movement and drawing produced line graphics either on screen or with a small robot called a turtle. The language was originally conceived to teach concepts of programming related to Lisp and only later to enable what Papert called \"body-syntonic reasoning\", where students could understand (and predict and reason about) the turtle's motion by imagining what they would do if they were the turtle. There are substantial differences among the many dialects of Logo, and the situation is confused by the regular appearance of turtle-graphics programs that mistakenly call themselves Logo.\n" +
                    "Logo is a multi-paradigm adaptation and dialect of Lisp, a functional programming language. There is no standard Logo, but UCBLogo has best facilities for handling lists, files, I/O, and recursion in scripts, and can be used to teach all computer science concepts, as UC Berkeley lecturer Brian Harvey did in his Computer Science Logo Style trilogy. For tertiary level teaching, however, Logo has been superseded by Scheme, and scripting languages.",
            "MATLAB (matrix laboratory) is a multi-paradigm numerical computing environment and fourth-generation programming language. A proprietary programming language developed by MathWorks, MATLAB allows matrix manipulations, plotting of functions and data, implementation of algorithms, creation of user interfaces, and interfacing with programs written in other languages, including C, C++, Java, Fortran and Python.\n" +
                    "Although MATLAB is intended primarily for numerical computing, an optional toolbox uses the MuPAD symbolic engine, allowing access to symbolic computing abilities. An additional package, Simulink, adds graphical multi-domain simulation and model-based design for dynamic and embedded systems.\n" +
                    "In 2004, MATLAB had around one million users across industry and academia. MATLAB users come from various backgrounds of engineering, science, and economics.",
            "Objective-C is a general-purpose, object-oriented programming language that adds Smalltalk-style messaging to the C programming language. It was the main programming language used by Apple for the OS X and iOS operating systems, and their respective application programming interfaces (APIs): Cocoa and Cocoa Touch prior to the introduction of Swift.\n" +
                    "The programming language Objective-C was originally developed in the early 1980s. It was selected as the main language used by NeXT for its NeXTSTEP operating system, from which OS X and iOS are derived. Portable Objective-C programs that do not use the Cocoa or Cocoa Touch libraries, or those using parts that may be ported or reimplemented for other systems, can also be compiled for any system supported by GNU Compiler Collection (GCC) or Clang.\n" +
                    "Objective-C source code 'implementation' program files usually have .m filename extensions, while Objective-C 'header/interface' files have .h extensions, the same as C header files. Objective-C++ files are denoted with a .mm file extension.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_languages_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int position =  getIntent().getExtras().getInt("Position");
        setTitle(ProgrammingLanguagesList[position]);


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String mDrawableName = "programming_languages_" + position;
        if(getResources().getIdentifier(mDrawableName, "drawable", getPackageName())== 0) {
            mDrawableName = "code";
        }

        int resId = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
        imageView.setImageResource(resId);



        TextView textView = (TextView) findViewById(R.id.context_text);
        assert textView != null;
        textView.setText(ProgrammingLanguagesDetails[position]);
        if(getResources().getIdentifier(mDrawableName, "drawable", getPackageName())== 0) {
            TextView newText = (TextView) findViewById(R.id.context_text);
            assert newText != null;
            textView.setText("Crap");
        }



    }
}