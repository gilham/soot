/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

public final class X2PDeclaration extends XPDeclaration
{
    private PDeclaration _pDeclaration_;

    public X2PDeclaration()
    {
    }

    public X2PDeclaration(
        PDeclaration _pDeclaration_)
    {
        setPDeclaration(_pDeclaration_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PDeclaration getPDeclaration()
    {
        return _pDeclaration_;
    }

    public void setPDeclaration(PDeclaration node)
    {
        if(_pDeclaration_ != null)
        {
            _pDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pDeclaration_ = node;
    }

    void removeChild(Node child)
    {
        if(_pDeclaration_ == child)
        {
            _pDeclaration_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pDeclaration_);
    }
}
