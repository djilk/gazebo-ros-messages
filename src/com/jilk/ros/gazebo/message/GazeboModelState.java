/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jilk.ros.gazebo.message;

import com.jilk.ros.message.Message;
import com.jilk.ros.message.MessageType;

/**
 *
 * @author David J. Jilk
 */
@MessageType(string = "gazebo_msgs/ModelState")
public class GazeboModelState extends Message {
    public String model_name;
    public GeometryPose pose;
    public GeometryTwist twist;
    public String reference_frame;
}
