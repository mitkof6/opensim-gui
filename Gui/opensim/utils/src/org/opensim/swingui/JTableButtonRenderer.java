/* -------------------------------------------------------------------------- *
 * OpenSim: JTableButtonRenderer.java                                         *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */

package org.opensim.swingui;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class JTableButtonRenderer implements TableCellRenderer {
   private TableCellRenderer defaultRenderer;

   public JTableButtonRenderer(TableCellRenderer renderer) { defaultRenderer = renderer; }

   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      if(value instanceof Component) {
         Component comp = (Component)value;
         if(isSelected) comp.setBackground(table.getSelectionBackground());
         else comp.setBackground(table.getBackground());
         return comp;
      } else return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
   }
}
