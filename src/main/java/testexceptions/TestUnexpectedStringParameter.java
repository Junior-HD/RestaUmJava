/*
 * The MIT License
 *
 * Copyright 2022 Maurício Moraes Nantes.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package testexceptions;

public class TestUnexpectedStringParameter{
    public TestUnexpectedStringParameter(String base, String espected) throws Exception{
        
        if(!espected.equals(base)){
            throw new Exception("Expected " + espected + " in base parameter String '" + base);
        }
        
    }
    public TestUnexpectedStringParameter(String base, String[] espected) throws Exception{
        String exmsg = "";
        boolean pass = false;
        String orStr = "";
        for(int i = 0; i < espected.length; i++){
            exmsg = exmsg + orStr + espected[i];
            orStr = " or ";
            if(espected[i].equals(base)){
                pass = true;
            }
        }
        if(pass == false){
            throw new Exception("Expected " + exmsg + " in base parameter String '" + base);
        }
    }
}
