# PowerShell script to create fake commits for Dec 20-23, 2025

# Define the commits data with realistic messages
$commits = @(
    @{ Date = "2025-12-20 09:00:00"; Message = "feat: implement array sorting algorithm" },
    @{ Date = "2025-12-20 14:30:00"; Message = "fix: resolve edge case in binary search implementation" },
    @{ Date = "2025-12-21 10:00:00"; Message = "docs: update README with installation instructions" },
    @{ Date = "2025-12-21 16:45:00"; Message = "refactor: optimize time complexity of data structure" },
    @{ Date = "2025-12-22 09:30:00"; Message = "test: add unit tests for linked list operations" },
    @{ Date = "2025-12-22 15:15:00"; Message = "chore: update dependencies and fix linting issues" },
    @{ Date = "2025-12-23 08:45:00"; Message = "feat: add hash table implementation" },
    @{ Date = "2025-12-23 17:30:00"; Message = "docs: add API documentation for hash functions" }
)

# Create commits
foreach ($commit in $commits) {
    # Create a small change
    $timestamp = Get-Date -Format "yyyyMMdd-HHmmss"
    $filename = "commit_$timestamp.txt"
    $content = "Fake commit for $($commit.Date)"
    
    # Write file
    Set-Content -Path $filename -Value $content
    
    # Add and commit
    git add $filename
    git commit -m $commit.Message --date="$($commit.Date)"
    
    Write-Host "Created commit: $($commit.Message) at $($commit.Date)"
}

Write-Host "All fake commits created successfully!"
