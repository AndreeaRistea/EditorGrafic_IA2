package GUI;
import javax.swing.*;
import data.Dreapta;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.text.View;

import XML.Load;
import XML.Save;

import java.io.*;
import java.util.*;
public class Fereastra extends JFrame
{
	 public static void main ( String [] args ) throws IOException
	    {
	        Fereastra app = new Fereastra();
	    }
	  public Fereastra ()
	  {
	        this.setSize( 500, 500 );
	        this.setTitle( "Figuri Geometrice" );
	        this.setVisible(true);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        Load p;
	        p = new Load();
	        p.LoadFile();
	        Save w;
	        w = new Save();
	        w.SaveInFile();
	    }
}
