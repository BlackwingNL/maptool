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
package net.rptools.clientserver.simple.server;

import net.rptools.clientserver.simple.AbstractConnection;
import net.rptools.clientserver.simple.Connection;

public interface ServerConnection extends Connection {
  void handleDisconnect(AbstractConnection conn);

  void handleMessage(String id, byte[] message);

  void addObserver(ServerObserver observer);

  void removeObserver(ServerObserver observer);

  void broadcastMessage(byte[] message);

  void broadcastMessage(String[] exclude, byte[] message);

  void sendMessage(String id, byte[] message);

  void sendMessage(String id, Object channel, byte[] message);
}
