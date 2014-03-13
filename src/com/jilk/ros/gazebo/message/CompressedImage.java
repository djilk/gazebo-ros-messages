/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jilk.ros.gazebo.message;

import com.jilk.ros.message.Message;
import com.jilk.ros.message.MessageType;
import com.jilk.ros.message.Header;

/**
 *
 * @author David J. Jilk
 * 
 */
@MessageType(string = "sensor_msgs/CompressedImage")
public class CompressedImage extends Message {
    public Header header;
    public String format;
    public String data;
}
