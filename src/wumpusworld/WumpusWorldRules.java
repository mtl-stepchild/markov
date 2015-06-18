package wumpusworld;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import utils.ClosedRange;
import core.Player;
import core.Rules;
import core.Score;

/*
 * Full details found:
 * http://www.cis.temple.edu/~giorgio/cis587/readings/wumpus.shtml
 */
public class WumpusWorldRules implements Rules<WumpusWorldState, WumpusWorldAction>
{
    private static final int NUMBER_OF_PLAYERS = 1;

    @Override
    public WumpusWorldState generateInitialState(final Collection<Player> players)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WumpusWorldState transition(final WumpusWorldState state, final WumpusWorldAction action)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClosedRange<Integer> numberOfPlayers()
    {
        return new ClosedRange<Integer>(NUMBER_OF_PLAYERS, NUMBER_OF_PLAYERS);
    }

    @Override
    public Collection<WumpusWorldAction> getAvailableActions(final Player player,
            final WumpusWorldState state)
    {
        if(isTerminal(state))
        {
            return Collections.emptyList();
        }
        return Arrays.asList(WumpusWorldAction.values());
    }

    @Override
    public boolean isTerminal(final WumpusWorldState state)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Player getCurrentPlayer(final WumpusWorldState state)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WumpusWorldState filterState(final WumpusWorldState state, final Player p)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WumpusWorldState copyState(final WumpusWorldState state)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Score score(final WumpusWorldState state, final Player p)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<Player, Score> scores(final WumpusWorldState state)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
