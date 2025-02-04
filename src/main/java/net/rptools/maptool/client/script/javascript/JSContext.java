/*
 * This software Copyright by the RPTools.net development team, and
 * licensed under the Affero GPL Version 3 or, at your option, any later
 * version.
 *
 * MapTool Source Code is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received a copy of the GNU Affero General Public
 * License * along with this source Code.  If not, please visit
 * <http://www.gnu.org/licenses/> and specifically the Affero license
 * text at <http://www.gnu.org/licenses/agpl.html>.
 */
package net.rptools.maptool.client.script.javascript;

import com.oracle.truffle.js.scriptengine.*;
import java.util.*;
import javax.script.*;
import org.graalvm.polyglot.*;
import org.graalvm.polyglot.HostAccess.*;

public class JSContext {
  public boolean isTrusted;
  public Context context;
  public String name;

  public JSContext(boolean t, Context c, String name) {
    this.isTrusted = t;
    this.context = c;
    this.name = name;
  }
}
