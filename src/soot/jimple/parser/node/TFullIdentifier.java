/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

public final class TFullIdentifier extends Token
{
    public TFullIdentifier(String text)
    {
        setText(text);
    }

    public TFullIdentifier(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TFullIdentifier(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFullIdentifier(this);
    }
}
