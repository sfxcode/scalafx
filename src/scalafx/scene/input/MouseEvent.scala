/*
* Copyright (c) 2012, ScalaFX Project
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*     * Redistributions of source code must retain the above copyright
*       notice, this list of conditions and the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright
*       notice, this list of conditions and the following disclaimer in the
*       documentation and/or other materials provided with the distribution.
*     * Neither the name of the ScalaFX Project nor the
*       names of its contributors may be used to endorse or promote products
*       derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
* ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
* FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
* AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package scalafx.scene.input

import javafx.scene.{ input => jfxsi }
import scalafx.delegate.SFXDelegate

object MouseEvent {
  implicit def sfxMouseEvent2jfx(me: MouseEvent) = me.delegate

  val Any = jfxsi.MouseEvent.ANY

  val DragDetected = jfxsi.MouseEvent.DRAG_DETECTED

  val MouseClicked = jfxsi.MouseEvent.MOUSE_CLICKED

  val MouseDragged = jfxsi.MouseEvent.MOUSE_DRAGGED

  val MouseEntered = jfxsi.MouseEvent.MOUSE_ENTERED

  val MouseEnteredTarget = jfxsi.MouseEvent.MOUSE_ENTERED_TARGET

  val MouseExited = jfxsi.MouseEvent.MOUSE_EXITED

  val MouseExitedTarget = jfxsi.MouseEvent.MOUSE_EXITED_TARGET

  val MouseMoved = jfxsi.MouseEvent.MOUSE_MOVED

  val MousePressed = jfxsi.MouseEvent.MOUSE_PRESSED

  val MouseReleased = jfxsi.MouseEvent.MOUSE_RELEASED

}

class MouseEvent(override val delegate: jfxsi.MouseEvent) extends InputEvent(delegate) with SFXDelegate[jfxsi.MouseEvent] {

  /**
   * Which, if any, of the mouse buttons is responsible for this event.
   */
  def button = delegate.getButton

  /**
   * Returns number of mouse clicks associated with this event.
   */
  def clickCount = delegate.getClickCount

  def sceneX = delegate.getSceneX

  def sceneY = delegate.getSceneY

  def screenX = delegate.getScreenX

  def screenY = delegate.getScreenY

  def x = delegate.getX

  def y = delegate.getY

  /**
   * Whether or not the Alt modifier is down on this event.
   */
  def altDown = delegate.isAltDown

  /**
   * Whether or not the Control modifier is down on this event.
   */
  def controlDown = delegate.isControlDown

  /**
   * Determines whether this event will be followed by DRAG_DETECTED event.
   */
  def dragDetect = delegate.isDragDetect

  /**
   * Augments drag detection behavior.
   */
  def dragDetect_=(detected: Boolean) {
    delegate.setDragDetect(detected)
  }

  /**
   * Whether or not the Meta modifier is down on this event.
   */
  def metaDown = delegate.isMetaDown

  /**
   * Returns true if middle button (button 2) is currently pressed.
   */
  def middleButtonDown = delegate.isMiddleButtonDown

  /**
   * Returns true if primary button (button 1, usually the left) is currently pressed.
   */
  def primaryButtonDown = delegate.isPrimaryButtonDown

  /**
   * Returns true if secondary button (button 1, usually the right) is currently pressed.
   */
  def secondaryButtonDown = delegate.isSecondaryButtonDown

  /**
   * Whether or not the Shift modifier is down on this event.
   */
  def shiftDown = delegate.isShiftDown

  /**
   * Returns whether or not the host platform common shortcut modifier is down on this event.
   */
  def shortcutDown = delegate.isShortcutDown

  /**
   * Indicates whether the mouse cursor stayed in the system-provided hysteresis area since last pressed event that occurred before this event.
   */
  def stillSincePress = delegate.isStillSincePress

}