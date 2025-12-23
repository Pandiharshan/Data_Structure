# -------- GREEDY COMMITS WITH PAST DATES --------

$commits = @(
    # 12-12-2025 (Easy)
    @{ file="Greedy/Easy/AssignCookies.java"; msg="Implement greedy matching for cookie assignment"; date="2025-12-12T09:05:00" },
    @{ file="Greedy/Easy/FractionalKnapsackProblem.java"; msg="Solve fractional knapsack using value to weight ratio"; date="2025-12-12T09:20:00" },
    @{ file="Greedy/Easy/MinimumCoins.java"; msg="Apply greedy approach to minimize number of coins"; date="2025-12-12T09:40:00" },
    @{ file="Greedy/Easy/LemonadeChange.java"; msg="Handle change distribution using greedy counting"; date="2025-12-12T10:05:00" },
    @{ file="Greedy/Easy/ValidParenthesisChecker.java"; msg="Validate parentheses using greedy range tracking"; date="2025-12-12T10:25:00" },

    # 13-12-2025 (Medium)
    @{ file="Greedy/Medium/NMeetingsInOneRoom.java"; msg="Schedule meetings using end time based greedy strategy"; date="2025-12-13T09:10:00" },
    @{ file="Greedy/Medium/InsertInterval.java"; msg="Insert and merge intervals using greedy logic"; date="2025-12-13T09:35:00" },
    @{ file="Greedy/Medium/MergeIntervals.java"; msg="Merge overlapping intervals after sorting"; date="2025-12-13T10:00:00" },
    @{ file="Greedy/Medium/NonOverlappingIntervals.java"; msg="Remove minimum overlapping intervals greedily"; date="2025-12-13T10:30:00" },

    # 14-12-2025 (Medium)
    @{ file="Greedy/Medium/JumpGame.java"; msg="Check reachability using greedy max range tracking"; date="2025-12-14T09:15:00" },
    @{ file="Greedy/Medium/JumpGame2.java"; msg="Calculate minimum jumps using greedy window expansion"; date="2025-12-14T09:35:00" },
    @{ file="Greedy/Medium/MinimumPlatforms.java"; msg="Determine minimum platforms using arrival and departure sorting"; date="2025-12-14T10:05:00" },
    @{ file="Greedy/Medium/JobSequencingProblem.java"; msg="Maximize profit using deadline based greedy scheduling"; date="2025-12-14T10:35:00" },

    # 15-12-2025 (Medium)
    @{ file="Greedy/Medium/LRUPageReplacement.java"; msg="Simulate LRU page replacement using greedy eviction"; date="2025-12-15T11:05:00" },
    @{ file="Greedy/Medium/ShortestJobFirst.java"; msg="Compute average waiting time using SJF greedy scheduling"; date="2025-12-15T11:35:00" },

    # 16-12-2025 (Hard)
    @{ file="Greedy/Hard/Candy.java"; msg="Distribute candies using two-pass greedy approach"; date="2025-12-16T09:20:00" }
)

foreach ($c in $commits) {
    git add $c.file
    $env:GIT_AUTHOR_DATE = $c.date
    $env:GIT_COMMITTER_DATE = $c.date
    git commit -m $c.msg
}
